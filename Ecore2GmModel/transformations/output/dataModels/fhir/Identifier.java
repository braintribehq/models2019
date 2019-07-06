/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Identifier of the Data Model fhir.
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
{@link type}, 
{@link period}, 
{@link assigner}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getPeriod},
{@link getAssigner},
{@link setType},
{@link setPeriod},
{@link setAssigner},
 */

@Description("An identifier - identifies some entity uniquely and unambiguously. Typically this is used for business identifiers.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface Identifier extends GenericEntity {

	EntityType<Identifier> T = EntityTypes.T(Identifier.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String period = "period";
	java.lang.String assigner = "assigner";

	@Description("A coded type for the identifier that can be used to determine which identifier to use for a specific purpose.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("Time period during which identifier is/was valid for use.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("Organization that issued/manages the identifier.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getAssigner();
	void setAssigner(com.braintribe.model.generic.GenericEntity assigner);
}
