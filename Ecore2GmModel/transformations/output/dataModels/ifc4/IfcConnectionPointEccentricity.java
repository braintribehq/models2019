/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcConnectionPointEccentricity of the Data Model iai.
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
{@link EccentricityInX}, 
{@link EccentricityInXAsString}, 
{@link EccentricityInY}, 
{@link EccentricityInYAsString}, 
{@link EccentricityInZ}, 
{@link EccentricityInZAsString}, 

* It provides of then following operations (getters and setters)
{@link getEccentricityInX},
{@link getEccentricityInXAsString},
{@link getEccentricityInY},
{@link getEccentricityInYAsString},
{@link getEccentricityInZ},
{@link getEccentricityInZAsString},
{@link setEccentricityInX},
{@link setEccentricityInXAsString},
{@link setEccentricityInY},
{@link setEccentricityInYAsString},
{@link setEccentricityInZ},
{@link setEccentricityInZAsString},
 */

@Description("")

public interface IfcConnectionPointEccentricity extends GenericEntity, ifc4.IfcConnectionPointGeometry {

	EntityType<IfcConnectionPointEccentricity> T = EntityTypes.T(IfcConnectionPointEccentricity.class);

	/* Constants for each property name. */
	java.lang.String EccentricityInX = "EccentricityInX";
	java.lang.String EccentricityInXAsString = "EccentricityInXAsString";
	java.lang.String EccentricityInY = "EccentricityInY";
	java.lang.String EccentricityInYAsString = "EccentricityInYAsString";
	java.lang.String EccentricityInZ = "EccentricityInZ";
	java.lang.String EccentricityInZAsString = "EccentricityInZAsString";

	@Description("")
	@Mandatory
	java.lang.Double getEccentricityInX();
	void setEccentricityInX(java.lang.Double EccentricityInX);
	@Description("")
	@Mandatory
	java.lang.String getEccentricityInXAsString();
	void setEccentricityInXAsString(java.lang.String EccentricityInXAsString);
	@Description("")
	@Mandatory
	java.lang.Double getEccentricityInY();
	void setEccentricityInY(java.lang.Double EccentricityInY);
	@Description("")
	@Mandatory
	java.lang.String getEccentricityInYAsString();
	void setEccentricityInYAsString(java.lang.String EccentricityInYAsString);
	@Description("")
	@Mandatory
	java.lang.Double getEccentricityInZ();
	void setEccentricityInZ(java.lang.Double EccentricityInZ);
	@Description("")
	@Mandatory
	java.lang.String getEccentricityInZAsString();
	void setEccentricityInZAsString(java.lang.String EccentricityInZAsString);
}
