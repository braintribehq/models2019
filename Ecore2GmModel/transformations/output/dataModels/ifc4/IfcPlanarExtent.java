/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPlanarExtent of the Data Model iai.
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
{@link SizeInX}, 
{@link SizeInXAsString}, 
{@link SizeInY}, 
{@link SizeInYAsString}, 

* It provides of then following operations (getters and setters)
{@link getSizeInX},
{@link getSizeInXAsString},
{@link getSizeInY},
{@link getSizeInYAsString},
{@link setSizeInX},
{@link setSizeInXAsString},
{@link setSizeInY},
{@link setSizeInYAsString},
 */

@Description("")

public interface IfcPlanarExtent extends GenericEntity, ifc4.IfcGeometricRepresentationItem {

	EntityType<IfcPlanarExtent> T = EntityTypes.T(IfcPlanarExtent.class);

	/* Constants for each property name. */
	java.lang.String SizeInX = "SizeInX";
	java.lang.String SizeInXAsString = "SizeInXAsString";
	java.lang.String SizeInY = "SizeInY";
	java.lang.String SizeInYAsString = "SizeInYAsString";

	@Description("")
	@Mandatory
	java.lang.Double getSizeInX();
	void setSizeInX(java.lang.Double SizeInX);
	@Description("")
	@Mandatory
	java.lang.String getSizeInXAsString();
	void setSizeInXAsString(java.lang.String SizeInXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getSizeInY();
	void setSizeInY(java.lang.Double SizeInY);
	@Description("")
	@Mandatory
	java.lang.String getSizeInYAsString();
	void setSizeInYAsString(java.lang.String SizeInYAsString);
}
