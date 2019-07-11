/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadLinearForce of the Data Model iai.
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
{@link LinearForceX}, 
{@link LinearForceXAsString}, 
{@link LinearForceY}, 
{@link LinearForceYAsString}, 
{@link LinearForceZ}, 
{@link LinearForceZAsString}, 
{@link LinearMomentX}, 
{@link LinearMomentXAsString}, 
{@link LinearMomentY}, 
{@link LinearMomentYAsString}, 
{@link LinearMomentZ}, 
{@link LinearMomentZAsString}, 

* It provides of then following operations (getters and setters)
{@link getLinearForceX},
{@link getLinearForceXAsString},
{@link getLinearForceY},
{@link getLinearForceYAsString},
{@link getLinearForceZ},
{@link getLinearForceZAsString},
{@link getLinearMomentX},
{@link getLinearMomentXAsString},
{@link getLinearMomentY},
{@link getLinearMomentYAsString},
{@link getLinearMomentZ},
{@link getLinearMomentZAsString},
{@link setLinearForceX},
{@link setLinearForceXAsString},
{@link setLinearForceY},
{@link setLinearForceYAsString},
{@link setLinearForceZ},
{@link setLinearForceZAsString},
{@link setLinearMomentX},
{@link setLinearMomentXAsString},
{@link setLinearMomentY},
{@link setLinearMomentYAsString},
{@link setLinearMomentZ},
{@link setLinearMomentZAsString},
 */

@Description("")

public interface IfcStructuralLoadLinearForce extends GenericEntity, ifc4.IfcStructuralLoadStatic {

	EntityType<IfcStructuralLoadLinearForce> T = EntityTypes.T(IfcStructuralLoadLinearForce.class);

	/* Constants for each property name. */
	java.lang.String LinearForceX = "LinearForceX";
	java.lang.String LinearForceXAsString = "LinearForceXAsString";
	java.lang.String LinearForceY = "LinearForceY";
	java.lang.String LinearForceYAsString = "LinearForceYAsString";
	java.lang.String LinearForceZ = "LinearForceZ";
	java.lang.String LinearForceZAsString = "LinearForceZAsString";
	java.lang.String LinearMomentX = "LinearMomentX";
	java.lang.String LinearMomentXAsString = "LinearMomentXAsString";
	java.lang.String LinearMomentY = "LinearMomentY";
	java.lang.String LinearMomentYAsString = "LinearMomentYAsString";
	java.lang.String LinearMomentZ = "LinearMomentZ";
	java.lang.String LinearMomentZAsString = "LinearMomentZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getLinearForceX();
	void setLinearForceX(java.lang.Double LinearForceX);
	@Description("")
	@Mandatory
	java.lang.String getLinearForceXAsString();
	void setLinearForceXAsString(java.lang.String LinearForceXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLinearForceY();
	void setLinearForceY(java.lang.Double LinearForceY);
	@Description("")
	@Mandatory
	java.lang.String getLinearForceYAsString();
	void setLinearForceYAsString(java.lang.String LinearForceYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLinearForceZ();
	void setLinearForceZ(java.lang.Double LinearForceZ);
	@Description("")
	@Mandatory
	java.lang.String getLinearForceZAsString();
	void setLinearForceZAsString(java.lang.String LinearForceZAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLinearMomentX();
	void setLinearMomentX(java.lang.Double LinearMomentX);
	@Description("")
	@Mandatory
	java.lang.String getLinearMomentXAsString();
	void setLinearMomentXAsString(java.lang.String LinearMomentXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLinearMomentY();
	void setLinearMomentY(java.lang.Double LinearMomentY);
	@Description("")
	@Mandatory
	java.lang.String getLinearMomentYAsString();
	void setLinearMomentYAsString(java.lang.String LinearMomentYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getLinearMomentZ();
	void setLinearMomentZ(java.lang.Double LinearMomentZ);
	@Description("")
	@Mandatory
	java.lang.String getLinearMomentZAsString();
	void setLinearMomentZAsString(java.lang.String LinearMomentZAsString);
}
