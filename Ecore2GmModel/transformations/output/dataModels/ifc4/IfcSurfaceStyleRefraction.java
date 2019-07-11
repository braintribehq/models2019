/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcSurfaceStyleRefraction of the Data Model iai.
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
{@link RefractionIndex}, 
{@link RefractionIndexAsString}, 
{@link DispersionFactor}, 
{@link DispersionFactorAsString}, 

* It provides of then following operations (getters and setters)
{@link getRefractionIndex},
{@link getRefractionIndexAsString},
{@link getDispersionFactor},
{@link getDispersionFactorAsString},
{@link setRefractionIndex},
{@link setRefractionIndexAsString},
{@link setDispersionFactor},
{@link setDispersionFactorAsString},
 */

@Description("")

public interface IfcSurfaceStyleRefraction extends GenericEntity, ifc4.IfcPresentationItem, ifc4.IfcSurfaceStyleElementSelect {

	EntityType<IfcSurfaceStyleRefraction> T = EntityTypes.T(IfcSurfaceStyleRefraction.class);

	/* Constants for each property name. */
	java.lang.String RefractionIndex = "RefractionIndex";
	java.lang.String RefractionIndexAsString = "RefractionIndexAsString";
	java.lang.String DispersionFactor = "DispersionFactor";
	java.lang.String DispersionFactorAsString = "DispersionFactorAsString";

	@Description("")
	@Mandatory
	java.lang.Double getRefractionIndex();
	void setRefractionIndex(java.lang.Double RefractionIndex);
	@Description("")
	@Mandatory
	java.lang.String getRefractionIndexAsString();
	void setRefractionIndexAsString(java.lang.String RefractionIndexAsString);
	@Description("")
	@Mandatory
	java.lang.Double getDispersionFactor();
	void setDispersionFactor(java.lang.Double DispersionFactor);
	@Description("")
	@Mandatory
	java.lang.String getDispersionFactorAsString();
	void setDispersionFactorAsString(java.lang.String DispersionFactorAsString);
}
