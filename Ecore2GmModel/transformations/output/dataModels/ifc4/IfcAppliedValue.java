/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcAppliedValue of the Data Model iai.
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
{@link Name}, 
{@link Description}, 
{@link AppliedValue}, 
{@link UnitBasis}, 
{@link ApplicableDate}, 
{@link FixedUntilDate}, 
{@link Category}, 
{@link Condition}, 
{@link ArithmeticOperator}, 
{@link Components}, 
{@link HasExternalReference}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDescription},
{@link getAppliedValue},
{@link getUnitBasis},
{@link getApplicableDate},
{@link getFixedUntilDate},
{@link getCategory},
{@link getCondition},
{@link getArithmeticOperator},
{@link getComponents},
{@link getHasExternalReference},
{@link setName},
{@link setDescription},
{@link setAppliedValue},
{@link setUnitBasis},
{@link setApplicableDate},
{@link setFixedUntilDate},
{@link setCategory},
{@link setCondition},
{@link setArithmeticOperator},
{@link setComponents},
{@link setHasExternalReference},
 */

@Description("")

public interface IfcAppliedValue extends GenericEntity, ifc4.IfcMetricValueSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcAppliedValue> T = EntityTypes.T(IfcAppliedValue.class);

	/* Constants for each property name. */
	java.lang.String Name = "Name";
	java.lang.String Description = "Description";
	java.lang.String AppliedValue = "AppliedValue";
	java.lang.String UnitBasis = "UnitBasis";
	java.lang.String ApplicableDate = "ApplicableDate";
	java.lang.String FixedUntilDate = "FixedUntilDate";
	java.lang.String Category = "Category";
	java.lang.String Condition = "Condition";
	java.lang.String ArithmeticOperator = "ArithmeticOperator";
	java.lang.String Components = "Components";
	java.lang.String HasExternalReference = "HasExternalReference";

	@Description("")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String Name);
	@Description("")
	@Mandatory
	java.lang.String getDescription();
	void setDescription(java.lang.String Description);
	@Description("")
	@Mandatory
	ifc4.IfcAppliedValueSelect getAppliedValue();
	void setAppliedValue(ifc4.IfcAppliedValueSelect AppliedValue);
	@Description("")
	@Mandatory
	ifc4.IfcMeasureWithUnit getUnitBasis();
	void setUnitBasis(ifc4.IfcMeasureWithUnit UnitBasis);
	@Description("")
	@Mandatory
	java.lang.String getApplicableDate();
	void setApplicableDate(java.lang.String ApplicableDate);
	@Description("")
	@Mandatory
	java.lang.String getFixedUntilDate();
	void setFixedUntilDate(java.lang.String FixedUntilDate);
	@Description("")
	@Mandatory
	java.lang.String getCategory();
	void setCategory(java.lang.String Category);
	@Description("")
	@Mandatory
	java.lang.String getCondition();
	void setCondition(java.lang.String Condition);
	@Description("")
	@Mandatory
	ifc4.IfcArithmeticOperatorEnum getArithmeticOperator();
	void setArithmeticOperator(ifc4.IfcArithmeticOperatorEnum ArithmeticOperator);
	@Description("")
	
	java.util.List<ifc4.IfcAppliedValue> getComponents();
	void setComponents(java.util.List<ifc4.IfcAppliedValue> Components);

	@Description("")
	
	java.util.List<ifc4.IfcExternalReferenceRelationship> getHasExternalReference();
	void setHasExternalReference(java.util.List<ifc4.IfcExternalReferenceRelationship> HasExternalReference);

}
