/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ObservationDefinitionQuantitativeDetails of the Data Model fhir.
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
{@link customaryUnit}, 
{@link unit}, 

* It provides of then following operations (getters and setters)
{@link getCustomaryUnit},
{@link getUnit},
{@link setCustomaryUnit},
{@link setUnit},
 */

@Description("Set of definitional characteristics for a kind of observation or measurement produced or consumed by an orderable health care service.")

public interface ObservationDefinitionQuantitativeDetails extends GenericEntity, fhir.BackboneElement {

	EntityType<ObservationDefinitionQuantitativeDetails> T = EntityTypes.T(ObservationDefinitionQuantitativeDetails.class);

	/* Constants for each property name. */
	java.lang.String customaryUnit = "customaryUnit";
	java.lang.String unit = "unit";

	@Description("Customary unit used to report quantitative results of observations conforming to this ObservationDefinition.")
	@Mandatory
	fhir.CodeableConcept getCustomaryUnit();
	void setCustomaryUnit(fhir.CodeableConcept customaryUnit);
	@Description("SI unit used to report quantitative results of observations conforming to this ObservationDefinition.")
	@Mandatory
	fhir.CodeableConcept getUnit();
	void setUnit(fhir.CodeableConcept unit);
}
