package com.mohistmc.miraimbot.cmds.manager.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 实现指令的注册
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    public String name();

    public String[] alias() default {};

    public String usage() default "";

    public String description() default "";
}
