/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type String of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link minLength}, 
{@link maxLength}, 
{@link length}, 
{@link pattern}, 

* It provides of then following operations (getters and setters)
{@link getMinLength},
{@link getMaxLength},
{@link getLength},
{@link getPattern},
{@link setMinLength},
{@link setMaxLength},
{@link setLength},
{@link setPattern},
 */

@Description("Any set of values drawn from the value space of 'string', as specified by W3C Recommendation XML Schema Part 2: Datatypes.")

public interface String extends GenericEntity, iso20022.DataType {

	EntityType<String> T = EntityTypes.T(String.class);

	/* Constants for each property name. */
	java.lang.String minLength = "minLength";
	java.lang.String maxLength = "maxLength";
	java.lang.String length = "length";
	java.lang.String pattern = "pattern";

	@Description("The minimum number of units of characters.")
	@Mandatory
	java.lang.Integer getMinLength();
	void setMinLength(java.lang.Integer minLength);
	@Description("The number of units of characters.")
	@Mandatory
	java.lang.Integer getMaxLength();
	void setMaxLength(java.lang.Integer maxLength);
	@Description("The number of units of characters.")
	@Mandatory
	java.lang.Integer getLength();
	void setLength(java.lang.Integer length);
	@Description("A constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern.")
	@Mandatory
	java.lang.String getPattern();
	void setPattern(java.lang.String pattern);
}
