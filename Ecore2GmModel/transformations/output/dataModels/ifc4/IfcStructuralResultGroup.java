/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralResultGroup of the Data Model iai.
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
{@link TheoryType}, 
{@link ResultForLoadGroup}, 
{@link IsLinear}, 
{@link ResultGroupFor}, 

* It provides of then following operations (getters and setters)
{@link getTheoryType},
{@link getResultForLoadGroup},
{@link getIsLinear},
{@link getResultGroupFor},
{@link setTheoryType},
{@link setResultForLoadGroup},
{@link setIsLinear},
{@link setResultGroupFor},
 */

@Description("")

public interface IfcStructuralResultGroup extends GenericEntity, ifc4.IfcGroup {

	EntityType<IfcStructuralResultGroup> T = EntityTypes.T(IfcStructuralResultGroup.class);

	/* Constants for each property name. */
	java.lang.String TheoryType = "TheoryType";
	java.lang.String ResultForLoadGroup = "ResultForLoadGroup";
	java.lang.String IsLinear = "IsLinear";
	java.lang.String ResultGroupFor = "ResultGroupFor";

	@Description("")
	@Mandatory
	ifc4.IfcAnalysisTheoryTypeEnum getTheoryType();
	void setTheoryType(ifc4.IfcAnalysisTheoryTypeEnum TheoryType);
	@Description("")
	@Mandatory
	ifc4.IfcStructuralLoadGroup getResultForLoadGroup();
	void setResultForLoadGroup(ifc4.IfcStructuralLoadGroup ResultForLoadGroup);
	@Description("")
	@Mandatory
	ifc4.Tristate getIsLinear();
	void setIsLinear(ifc4.Tristate IsLinear);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcStructuralAnalysisModel> getResultGroupFor();
	void setResultGroupFor(java.util.List<ifc4.IfcStructuralAnalysisModel> ResultGroupFor);

}
