/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPropertyTableValue of the Data Model iai.
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
{@link DefiningValues}, 
{@link DefinedValues}, 
{@link Expression}, 
{@link DefiningUnit}, 
{@link DefinedUnit}, 
{@link CurveInterpolation}, 

* It provides of then following operations (getters and setters)
{@link getDefiningValues},
{@link getDefinedValues},
{@link getExpression},
{@link getDefiningUnit},
{@link getDefinedUnit},
{@link getCurveInterpolation},
{@link setDefiningValues},
{@link setDefinedValues},
{@link setExpression},
{@link setDefiningUnit},
{@link setDefinedUnit},
{@link setCurveInterpolation},
 */

@Description("")

public interface IfcPropertyTableValue extends GenericEntity, ifc4.IfcSimpleProperty {

	EntityType<IfcPropertyTableValue> T = EntityTypes.T(IfcPropertyTableValue.class);

	/* Constants for each property name. */
	java.lang.String DefiningValues = "DefiningValues";
	java.lang.String DefinedValues = "DefinedValues";
	java.lang.String Expression = "Expression";
	java.lang.String DefiningUnit = "DefiningUnit";
	java.lang.String DefinedUnit = "DefinedUnit";
	java.lang.String CurveInterpolation = "CurveInterpolation";

	@Description("")
	
	java.util.List<ifc4.IfcValue> getDefiningValues();
	void setDefiningValues(java.util.List<ifc4.IfcValue> DefiningValues);

	@Description("")
	
	java.util.List<ifc4.IfcValue> getDefinedValues();
	void setDefinedValues(java.util.List<ifc4.IfcValue> DefinedValues);

	@Description("")
	@Mandatory
	java.lang.String getExpression();
	void setExpression(java.lang.String Expression);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getDefiningUnit();
	void setDefiningUnit(ifc4.IfcUnit DefiningUnit);
	@Description("")
	@Mandatory
	ifc4.IfcUnit getDefinedUnit();
	void setDefinedUnit(ifc4.IfcUnit DefinedUnit);
	@Description("")
	@Mandatory
	ifc4.IfcCurveInterpolationEnum getCurveInterpolation();
	void setCurveInterpolation(ifc4.IfcCurveInterpolationEnum CurveInterpolation);
}
