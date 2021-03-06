package org.jboss.seam.drools.qualifiers;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.util.Nonbinding;
import javax.inject.Qualifier;

/**
 * 
 * @author Tihomir Surdilovic
 */
@Qualifier
@Target( TYPE )
@Documented
@Retention(RUNTIME)
@Inherited
public @interface EvaluatorDef {
	@Nonbinding String value();
}