/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelSpaceBoundary of the Data Model iai.
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
{@link RelatingSpace}, 
{@link RelatedBuildingElement}, 
{@link ConnectionGeometry}, 
{@link PhysicalOrVirtualBoundary}, 
{@link InternalOrExternalBoundary}, 

* It provides of then following operations (getters and setters)
{@link getRelatingSpace},
{@link getRelatedBuildingElement},
{@link getConnectionGeometry},
{@link getPhysicalOrVirtualBoundary},
{@link getInternalOrExternalBoundary},
{@link setRelatingSpace},
{@link setRelatedBuildingElement},
{@link setConnectionGeometry},
{@link setPhysicalOrVirtualBoundary},
{@link setInternalOrExternalBoundary},
 */

@Description("")

public interface IfcRelSpaceBoundary extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelSpaceBoundary> T = EntityTypes.T(IfcRelSpaceBoundary.class);

	/* Constants for each property name. */
	java.lang.String RelatingSpace = "RelatingSpace";
	java.lang.String RelatedBuildingElement = "RelatedBuildingElement";
	java.lang.String ConnectionGeometry = "ConnectionGeometry";
	java.lang.String PhysicalOrVirtualBoundary = "PhysicalOrVirtualBoundary";
	java.lang.String InternalOrExternalBoundary = "InternalOrExternalBoundary";

	@Description("")
	@Mandatory
	ifc4.IfcSpaceBoundarySelect getRelatingSpace();
	void setRelatingSpace(ifc4.IfcSpaceBoundarySelect RelatingSpace);
	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatedBuildingElement();
	void setRelatedBuildingElement(ifc4.IfcElement RelatedBuildingElement);
	@Description("")
	@Mandatory
	ifc4.IfcConnectionGeometry getConnectionGeometry();
	void setConnectionGeometry(ifc4.IfcConnectionGeometry ConnectionGeometry);
	@Description("")
	@Mandatory
	ifc4.IfcPhysicalOrVirtualEnum getPhysicalOrVirtualBoundary();
	void setPhysicalOrVirtualBoundary(ifc4.IfcPhysicalOrVirtualEnum PhysicalOrVirtualBoundary);
	@Description("")
	@Mandatory
	ifc4.IfcInternalOrExternalEnum getInternalOrExternalBoundary();
	void setInternalOrExternalBoundary(ifc4.IfcInternalOrExternalEnum InternalOrExternalBoundary);
}
