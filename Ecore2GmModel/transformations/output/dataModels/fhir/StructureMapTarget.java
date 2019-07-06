/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureMapTarget of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link parameter}, 

* It provides of then following operations (getters and setters)
{@link getParameter},
{@link setParameter},
 */

@Description("A Map of relationships between 2 structures that can be used to transform data.")

public interface StructureMapTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<StructureMapTarget> T = EntityTypes.T(StructureMapTarget.class);

	/* Constants for each property name. */
	java.lang.String parameter = "parameter";

	@Description("Parameters to the transform.")
	
	java.util.List<fhir.StructureMapParameter> getParameter();
	void setParameter(java.util.List<fhir.StructureMapParameter> parameter);

}