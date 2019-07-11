/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcLightSourcePositional of the Data Model iai.
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
{@link Position}, 
{@link Radius}, 
{@link RadiusAsString}, 
{@link ConstantAttenuation}, 
{@link ConstantAttenuationAsString}, 
{@link DistanceAttenuation}, 
{@link DistanceAttenuationAsString}, 
{@link QuadricAttenuation}, 
{@link QuadricAttenuationAsString}, 

* It provides of then following operations (getters and setters)
{@link getPosition},
{@link getRadius},
{@link getRadiusAsString},
{@link getConstantAttenuation},
{@link getConstantAttenuationAsString},
{@link getDistanceAttenuation},
{@link getDistanceAttenuationAsString},
{@link getQuadricAttenuation},
{@link getQuadricAttenuationAsString},
{@link setPosition},
{@link setRadius},
{@link setRadiusAsString},
{@link setConstantAttenuation},
{@link setConstantAttenuationAsString},
{@link setDistanceAttenuation},
{@link setDistanceAttenuationAsString},
{@link setQuadricAttenuation},
{@link setQuadricAttenuationAsString},
 */

@Description("")

public interface IfcLightSourcePositional extends GenericEntity, ifc4.IfcLightSource {

	EntityType<IfcLightSourcePositional> T = EntityTypes.T(IfcLightSourcePositional.class);

	/* Constants for each property name. */
	java.lang.String Position = "Position";
	java.lang.String Radius = "Radius";
	java.lang.String RadiusAsString = "RadiusAsString";
	java.lang.String ConstantAttenuation = "ConstantAttenuation";
	java.lang.String ConstantAttenuationAsString = "ConstantAttenuationAsString";
	java.lang.String DistanceAttenuation = "DistanceAttenuation";
	java.lang.String DistanceAttenuationAsString = "DistanceAttenuationAsString";
	java.lang.String QuadricAttenuation = "QuadricAttenuation";
	java.lang.String QuadricAttenuationAsString = "QuadricAttenuationAsString";

	@Description("")
	@Mandatory
	ifc4.IfcCartesianPoint getPosition();
	void setPosition(ifc4.IfcCartesianPoint Position);
	@Description("")
	@Mandatory
	java.lang.Double getRadius();
	void setRadius(java.lang.Double Radius);
	@Description("")
	@Mandatory
	java.lang.String getRadiusAsString();
	void setRadiusAsString(java.lang.String RadiusAsString);
	@Description("")
	@Mandatory
	java.lang.Double getConstantAttenuation();
	void setConstantAttenuation(java.lang.Double ConstantAttenuation);
	@Description("")
	@Mandatory
	java.lang.String getConstantAttenuationAsString();
	void setConstantAttenuationAsString(java.lang.String ConstantAttenuationAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDistanceAttenuation();
	void setDistanceAttenuation(java.lang.Double DistanceAttenuation);
	@Description("")
	@Mandatory
	java.lang.String getDistanceAttenuationAsString();
	void setDistanceAttenuationAsString(java.lang.String DistanceAttenuationAsString);
	@Description("")
	@Mandatory
	java.lang.Double getQuadricAttenuation();
	void setQuadricAttenuation(java.lang.Double QuadricAttenuation);
	@Description("")
	@Mandatory
	java.lang.String getQuadricAttenuationAsString();
	void setQuadricAttenuationAsString(java.lang.String QuadricAttenuationAsString);
}
