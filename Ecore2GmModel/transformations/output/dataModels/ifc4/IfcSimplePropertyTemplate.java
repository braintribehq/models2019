/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSimplePropertyTemplate of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link TemplateType}, 
{@link PrimaryMeasureType}, 
{@link SecondaryMeasureType}, 
{@link Enumerators}, 
{@link PrimaryUnit}, 
{@link SecondaryUnit}, 
{@link Expression}, 
{@link AccessState}, 

* It provides of then following operations (getters and setters)
{@link getTemplateType},
{@link getPrimaryMeasureType},
{@link getSecondaryMeasureType},
{@link getEnumerators},
{@link getPrimaryUnit},
{@link getSecondaryUnit},
{@link getExpression},
{@link getAccessState},
{@link setTemplateType},
{@link setPrimaryMeasureType},
{@link setSecondaryMeasureType},
{@link setEnumerators},
{@link setPrimaryUnit},
{@link setSecondaryUnit},
{@link setExpression},
{@link setAccessState},
 */

@Description("")

public interface IfcSimplePropertyTemplate extends GenericEntity, ifc4.IfcPropertyTemplate {

	EntityType<IfcSimplePropertyTemplate> T = EntityTypes.T(IfcSimplePropertyTemplate.class);

	/* Constants for each property name. */
	java.lang.String TemplateType = "TemplateType";
	java.lang.String PrimaryMeasureType = "PrimaryMeasureType";
	java.lang.String SecondaryMeasureType = "SecondaryMeasureType";
	java.lang.String Enumerators = "Enumerators";
	java.lang.String PrimaryUnit = "PrimaryUnit";
	java.lang.String SecondaryUnit = "SecondaryUnit";
	java.lang.String Expression = "Expression";
	java.lang.String AccessState = "AccessState";

	@Description("")
	@Mandatory
	ifc4.IfcSimplePropertyTemplateTypeEnum getTemplateType();
	void setTemplateType(ifc4.IfcSimplePropertyTemplateTypeEnum TemplateType);
	@Description("")
	@Mandatory
	java.lang.String getPrimaryMeasureType();
	void setPrimaryMeasureType(java.lang.String PrimaryMeasureType);
	@Description("")
	@Mandatory
	java.lang.String getSecondaryMeasureType();
	void setSecondaryMeasureType(java.lang.String SecondaryMeasureType);
	@Description("")
	@Mandatory
	ifc4.IfcPropertyEnumeration getEnumerators();
	void setEnumerators(ifc4.IfcPropertyEnumeration Enumerators);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getPrimaryUnit();
	void setPrimaryUnit(ifc4.IfcUnit PrimaryUnit);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getSecondaryUnit();
	void setSecondaryUnit(ifc4.IfcUnit SecondaryUnit);
	@Description("")
	@Mandatory
	java.lang.String getExpression();
	void setExpression(java.lang.String Expression);
	@Description("")
	@Mandatory
	ifc4.IfcStateEnum getAccessState();
	void setAccessState(ifc4.IfcStateEnum AccessState);
}
