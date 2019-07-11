/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadSingleDisplacementDistortion of the Data Model iai.
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
{@link Distortion}, 
{@link DistortionAsString}, 

* It provides of then following operations (getters and setters)
{@link getDistortion},
{@link getDistortionAsString},
{@link setDistortion},
{@link setDistortionAsString},
 */

@Description("")

public interface IfcStructuralLoadSingleDisplacementDistortion extends GenericEntity, ifc4.IfcStructuralLoadSingleDisplacement {

	EntityType<IfcStructuralLoadSingleDisplacementDistortion> T = EntityTypes.T(IfcStructuralLoadSingleDisplacementDistortion.class);

	/* Constants for each property name. */
	java.lang.String Distortion = "Distortion";
	java.lang.String DistortionAsString = "DistortionAsString";

	@Description("")
	@Mandatory
	java.lang.Double getDistortion();
	void setDistortion(java.lang.Double Distortion);
	@Description("")
	@Mandatory
	java.lang.String getDistortionAsString();
	void setDistortionAsString(java.lang.String DistortionAsString);
}
