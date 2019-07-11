/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadPlanarForce of the Data Model iai.
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
{@link PlanarForceX}, 
{@link PlanarForceXAsString}, 
{@link PlanarForceY}, 
{@link PlanarForceYAsString}, 
{@link PlanarForceZ}, 
{@link PlanarForceZAsString}, 

* It provides of then following operations (getters and setters)
{@link getPlanarForceX},
{@link getPlanarForceXAsString},
{@link getPlanarForceY},
{@link getPlanarForceYAsString},
{@link getPlanarForceZ},
{@link getPlanarForceZAsString},
{@link setPlanarForceX},
{@link setPlanarForceXAsString},
{@link setPlanarForceY},
{@link setPlanarForceYAsString},
{@link setPlanarForceZ},
{@link setPlanarForceZAsString},
 */

@Description("")

public interface IfcStructuralLoadPlanarForce extends GenericEntity, ifc4.IfcStructuralLoadStatic {

	EntityType<IfcStructuralLoadPlanarForce> T = EntityTypes.T(IfcStructuralLoadPlanarForce.class);

	/* Constants for each property name. */
	java.lang.String PlanarForceX = "PlanarForceX";
	java.lang.String PlanarForceXAsString = "PlanarForceXAsString";
	java.lang.String PlanarForceY = "PlanarForceY";
	java.lang.String PlanarForceYAsString = "PlanarForceYAsString";
	java.lang.String PlanarForceZ = "PlanarForceZ";
	java.lang.String PlanarForceZAsString = "PlanarForceZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getPlanarForceX();
	void setPlanarForceX(java.lang.Double PlanarForceX);
	@Description("")
	@Mandatory
	java.lang.String getPlanarForceXAsString();
	void setPlanarForceXAsString(java.lang.String PlanarForceXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getPlanarForceY();
	void setPlanarForceY(java.lang.Double PlanarForceY);
	@Description("")
	@Mandatory
	java.lang.String getPlanarForceYAsString();
	void setPlanarForceYAsString(java.lang.String PlanarForceYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getPlanarForceZ();
	void setPlanarForceZ(java.lang.Double PlanarForceZ);
	@Description("")
	@Mandatory
	java.lang.String getPlanarForceZAsString();
	void setPlanarForceZAsString(java.lang.String PlanarForceZAsString);
}
