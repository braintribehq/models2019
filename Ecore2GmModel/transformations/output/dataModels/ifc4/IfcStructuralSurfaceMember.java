/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralSurfaceMember of the Data Model iai.
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
{@link Thickness}, 
{@link ThicknessAsString}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getThickness},
{@link getThicknessAsString},
{@link setPredefinedType},
{@link setThickness},
{@link setThicknessAsString},
 */

@Description("")

public interface IfcStructuralSurfaceMember extends GenericEntity, ifc4.IfcStructuralMember {

	EntityType<IfcStructuralSurfaceMember> T = EntityTypes.T(IfcStructuralSurfaceMember.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String Thickness = "Thickness";
	java.lang.String ThicknessAsString = "ThicknessAsString";

	@Description("")
	@Mandatory
	ifc4.IfcStructuralSurfaceMemberTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcStructuralSurfaceMemberTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.lang.Double getThickness();
	void setThickness(java.lang.Double Thickness);
	@Description("")
	@Mandatory
	java.lang.String getThicknessAsString();
	void setThicknessAsString(java.lang.String ThicknessAsString);
}
