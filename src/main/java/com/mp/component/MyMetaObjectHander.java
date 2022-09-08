package com.mp.component;

import java.time.LocalDateTime;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

@Component
public class MyMetaObjectHander implements MetaObjectHandler {

	@Override
	public void insertFill(MetaObject metaObject) {
		boolean hasSetter = metaObject.hasSetter("createTime");
		if (hasSetter) {
			System.out.println("进入insertFill()方法~~");
			this.setInsertFieldValByName("createTime", LocalDateTime.now(), metaObject);
		}
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		boolean hasSetter = metaObject.hasSetter("updateTime");
		if (hasSetter) {
			System.out.println("进入updateFill()方法~~");
			this.setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
		}
	}

}
