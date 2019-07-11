/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcStructuralLoadConfiguration of the Data Model iai.
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
{@link Values}, 
{@link Locations}, 

* It provides of then following operations (getters and setters)
{@link getValues},
{@link getLocations},
{@link setValues},
{@link setLocations},
 */

@Description("")

public interface IfcStructuralLoadConfiguration extends GenericEntity, ifc4.IfcStructuralLoad {

	EntityType<IfcStructuralLoadConfiguration> T = EntityTypes.T(IfcStructuralLoadConfiguration.class);

	/* Constants for each property name. */
	java.lang.String Values = "Values";
	java.lang.String Locations = "Locations";

	@Description("")
	
	java.util.List<ifc4.IfcStructuralLoadOrResult> getValues();
	void setValues(java.util.List<ifc4.IfcStructuralLoadOrResult> Values);

	@Description("")
	
	java.util.List<ifc4.ListOfIfcLengthMeasure> getLocations();
	void setLocations(java.util.List<ifc4.ListOfIfcLengthMeasure> Locations);

}