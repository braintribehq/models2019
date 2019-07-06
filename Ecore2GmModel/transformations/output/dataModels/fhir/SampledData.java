/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SampledData of the Data Model fhir.
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
{@link origin}, 

* It provides of then following operations (getters and setters)
{@link getOrigin},
{@link setOrigin},
 */

@Description("A series of measurements taken by a device, with upper and lower limits. There may be more than one dimension in the data.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface SampledData extends GenericEntity {

	EntityType<SampledData> T = EntityTypes.T(SampledData.class);

	/* Constants for each property name. */
	java.lang.String origin = "origin";

	@Description("The base quantity that a measured value of zero represents. In addition, this provides the units of the entire measurement series.")
	@Mandatory
	fhir.Quantity getOrigin();
	void setOrigin(fhir.Quantity origin);
}
