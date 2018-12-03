package com.withing.photographer.converter;

import com.withing.photographer.domain.*;

public class UserTypeEnum extends IntegerEnumUserType<UserType> {
    public UserTypeEnum() {
        super(UserType.class);
    }
}
