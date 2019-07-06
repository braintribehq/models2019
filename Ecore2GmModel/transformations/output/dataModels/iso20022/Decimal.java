/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Decimal of the Data Model iso20022.
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
{@link minInclusive}, 
{@link minExclusive}, 
{@link maxInclusive}, 
{@link maxExclusive}, 
{@link totalDigits}, 
{@link fractionDigits}, 
{@link pattern}, 

* It provides of then following operations (getters and setters)
{@link getMinInclusive},
{@link getMinExclusive},
{@link getMaxInclusive},
{@link getMaxExclusive},
{@link getTotalDigits},
{@link getFractionDigits},
{@link getPattern},
{@link setMinInclusive},
{@link setMinExclusive},
{@link setMaxInclusive},
{@link setMaxExclusive},
{@link setTotalDigits},
{@link setFractionDigits},
{@link setPattern},
 */

@Description("Any set of values drawn from the value space of 'decimal', as specified by W3C Recommendation XML Schema Part 2: Datatypes")

public interface Decimal extends GenericEntity, iso20022.DataType {

	EntityType<Decimal> T = EntityTypes.T(Decimal.class);

	/* Constants for each property name. */
	java.lang.String minInclusive = "minInclusive";
	java.lang.String minExclusive = "minExclusive";
	java.lang.String maxInclusive = "maxInclusive";
	java.lang.String maxExclusive = "maxExclusive";
	java.lang.String totalDigits = "totalDigits";
	java.lang.String fractionDigits = "fractionDigits";
	java.lang.String pattern = "pattern";

	@Description("the lowest value in the allowed set of values")
	@Mandatory
	java.lang.String getMinInclusive();
	void setMinInclusive(java.lang.String minInclusive);
	@Description("the lowest but one value in the allowed set of values")
	@Mandatory
	java.lang.String getMinExclusive();
	void setMinExclusive(java.lang.String minExclusive);
	@Description("the highest value in the allowed set of values")
	@Mandatory
	java.lang.String getMaxInclusive();
	void setMaxInclusive(java.lang.String maxInclusive);
	@Description("the highest but one value in the allowed set of values")
	@Mandatory
	java.lang.String getMaxExclusive();
	void setMaxExclusive(java.lang.String maxExclusive);
	@Description("the maximum number of allowed digits in a Decimal number")
	@Mandatory
	java.lang.Integer getTotalDigits();
	void setTotalDigits(java.lang.Integer totalDigits);
	@Description("the fractional part of a Decimal number")
	@Mandatory
	java.lang.Integer getFractionDigits();
	void setFractionDigits(java.lang.Integer fractionDigits);
	@Description("A constraint on the value space of a datatype which is achieved by constraining the lexical space to literals which match a specific pattern.")
	@Mandatory
	java.lang.String getPattern();
	void setPattern(java.lang.String pattern);
}
