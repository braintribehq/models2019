/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelConnectsStructuralMember of the Data Model iai.
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
{@link RelatingStructuralMember}, 
{@link RelatedStructuralConnection}, 
{@link AppliedCondition}, 
{@link AdditionalConditions}, 
{@link SupportedLength}, 
{@link SupportedLengthAsString}, 
{@link ConditionCoordinateSystem}, 

* It provides of then following operations (getters and setters)
{@link getRelatingStructuralMember},
{@link getRelatedStructuralConnection},
{@link getAppliedCondition},
{@link getAdditionalConditions},
{@link getSupportedLength},
{@link getSupportedLengthAsString},
{@link getConditionCoordinateSystem},
{@link setRelatingStructuralMember},
{@link setRelatedStructuralConnection},
{@link setAppliedCondition},
{@link setAdditionalConditions},
{@link setSupportedLength},
{@link setSupportedLengthAsString},
{@link setConditionCoordinateSystem},
 */

@Description("")

public interface IfcRelConnectsStructuralMember extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelConnectsStructuralMember> T = EntityTypes.T(IfcRelConnectsStructuralMember.class);

	/* Constants for each property name. */
	java.lang.String RelatingStructuralMember = "RelatingStructuralMember";
	java.lang.String RelatedStructuralConnection = "RelatedStructuralConnection";
	java.lang.String AppliedCondition = "AppliedCondition";
	java.lang.String AdditionalConditions = "AdditionalConditions";
	java.lang.String SupportedLength = "SupportedLength";
	java.lang.String SupportedLengthAsString = "SupportedLengthAsString";
	java.lang.String ConditionCoordinateSystem = "ConditionCoordinateSystem";

	@Description("")
	@Mandatory
	ifc4.IfcStructuralMember getRelatingStructuralMember();
	void setRelatingStructuralMember(ifc4.IfcStructuralMember RelatingStructuralMember);
	@Description("")
	@Mandatory
	ifc4.IfcStructuralConnection getRelatedStructuralConnection();
	void setRelatedStructuralConnection(ifc4.IfcStructuralConnection RelatedStructuralConnection);
	@Description("")
	@Mandatory
	ifc4.IfcBoundaryCondition getAppliedCondition();
	void setAppliedCondition(ifc4.IfcBoundaryCondition AppliedCondition);
	@Description("")
	@Mandatory
	ifc4.IfcStructuralConnectionCondition getAdditionalConditions();
	void setAdditionalConditions(ifc4.IfcStructuralConnectionCondition AdditionalConditions);
	@Description("")
	@Mandatory
	java.lang.Double getSupportedLength();
	void setSupportedLength(java.lang.Double SupportedLength);
	@Description("")
	@Mandatory
	java.lang.String getSupportedLengthAsString();
	void setSupportedLengthAsString(java.lang.String SupportedLengthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcAxis2Placement3D getConditionCoordinateSystem();
	void setConditionCoordinateSystem(ifc4.IfcAxis2Placement3D ConditionCoordinateSystem);
}
