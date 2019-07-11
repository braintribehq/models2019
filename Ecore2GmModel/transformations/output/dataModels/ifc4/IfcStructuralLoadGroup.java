/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadGroup of the Data Model iai.
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
{@link PredefinedType}, 
{@link ActionType}, 
{@link ActionSource}, 
{@link Coefficient}, 
{@link CoefficientAsString}, 
{@link Purpose}, 
{@link SourceOfResultGroup}, 
{@link LoadGroupFor}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getActionType},
{@link getActionSource},
{@link getCoefficient},
{@link getCoefficientAsString},
{@link getPurpose},
{@link getSourceOfResultGroup},
{@link getLoadGroupFor},
{@link setPredefinedType},
{@link setActionType},
{@link setActionSource},
{@link setCoefficient},
{@link setCoefficientAsString},
{@link setPurpose},
{@link setSourceOfResultGroup},
{@link setLoadGroupFor},
 */

@Description("")

public interface IfcStructuralLoadGroup extends GenericEntity, ifc4.IfcGroup {

	EntityType<IfcStructuralLoadGroup> T = EntityTypes.T(IfcStructuralLoadGroup.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String ActionType = "ActionType";
	java.lang.String ActionSource = "ActionSource";
	java.lang.String Coefficient = "Coefficient";
	java.lang.String CoefficientAsString = "CoefficientAsString";
	java.lang.String Purpose = "Purpose";
	java.lang.String SourceOfResultGroup = "SourceOfResultGroup";
	java.lang.String LoadGroupFor = "LoadGroupFor";

	@Description("")
	@Mandatory
	ifc4.IfcLoadGroupTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcLoadGroupTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	ifc4.IfcActionTypeEnum getActionType();
	void setActionType(ifc4.IfcActionTypeEnum ActionType);
	@Description("")
	@Mandatory
	ifc4.IfcActionSourceTypeEnum getActionSource();
	void setActionSource(ifc4.IfcActionSourceTypeEnum ActionSource);
	@Description("")
	@Mandatory
	java.lang.Double getCoefficient();
	void setCoefficient(java.lang.Double Coefficient);
	@Description("")
	@Mandatory
	java.lang.String getCoefficientAsString();
	void setCoefficientAsString(java.lang.String CoefficientAsString);
	@Description("")
	@Mandatory
	java.lang.String getPurpose();
	void setPurpose(java.lang.String Purpose);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcStructuralResultGroup> getSourceOfResultGroup();
	void setSourceOfResultGroup(java.util.List<ifc4.IfcStructuralResultGroup> SourceOfResultGroup);

	@Description("")
	
	java.util.List<ifc4.IfcStructuralAnalysisModel> getLoadGroupFor();
	void setLoadGroupFor(java.util.List<ifc4.IfcStructuralAnalysisModel> LoadGroupFor);

}
