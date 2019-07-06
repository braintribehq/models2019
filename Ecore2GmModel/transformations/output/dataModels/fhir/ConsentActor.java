/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConsentActor of the Data Model fhir.
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
{@link role}, 
{@link reference}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link getReference},
{@link setRole},
{@link setReference},
 */

@Description("A record of a healthcare consumer?s  choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time.")

public interface ConsentActor extends GenericEntity, fhir.BackboneElement {

	EntityType<ConsentActor> T = EntityTypes.T(ConsentActor.class);

	/* Constants for each property name. */
	java.lang.String role = "role";
	java.lang.String reference = "reference";

	@Description("How the individual is involved in the resources content that is described in the exception.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
	@Description("The resource that identifies the actor. To identify actors by type, use group to identify a set of actors by some property they share (e.g. 'admitting officers').")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReference();
	void setReference(com.braintribe.model.generic.GenericEntity reference);
}
