package com.withing.photographer.converter;

import org.hibernate.*;
import org.hibernate.engine.spi.*;
import org.hibernate.usertype.*;

import java.io.*;
import java.sql.*;

public class IntegerEnumUserType<E extends Enum<E>> implements UserType {

    private static final int[] SQL_TYPES = {Types.INTEGER};
    private Class<E> clazz = null;

    protected IntegerEnumUserType(Class<E> c) {
        this.clazz = c;
    }

    @Override
    public int[] sqlTypes() {
        return SQL_TYPES;
    }

    @Override
    public Class<E> returnedClass() {
        return clazz;
    }

    @Override
    public boolean equals(Object x, Object y) throws HibernateException {
        if (x == y)
            return true;
        if (null == x || null == y)
            return false;
        return x.equals(y);
    }

    @Override
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] names, SharedSessionContractImplementor session, Object owner)
            throws HibernateException, SQLException {
        final int id = resultSet.getInt(names[0]);
        if (!resultSet.wasNull()) {
            try {
                return clazz.getMethod("findById", new Class[]{Integer.class}).invoke(null, id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Object value, int index, SharedSessionContractImplementor session)
            throws HibernateException, SQLException {
        if (null == value) {
            preparedStatement.setNull(index, SQL_TYPES[0]);
        } else {
            EnumsID eID = (EnumsID)value;
            preparedStatement.setInt(index, eID.getId());
        }
    }

    @Override
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object value) throws HibernateException {
        return (Serializable) value;
    }

    @Override
    public Object assemble(Serializable cached, Object owner) throws HibernateException {
        return cached;
    }

    @Override
    public Object replace(Object original, Object target, Object owner) throws HibernateException {
        return original;
    }

}
