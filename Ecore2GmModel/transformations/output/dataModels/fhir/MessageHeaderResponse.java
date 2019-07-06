/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageHeaderResponse of the Data Model fhir.
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
{@link details}, 

* It provides of then following operations (getters and setters)
{@link getDetails},
{@link setDetails},
 */

@Description("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.")

public interface MessageHeaderResponse extends GenericEntity, fhir.BackboneElement {

	EntityType<MessageHeaderResponse> T = EntityTypes.T(MessageHeaderResponse.class);

	/* Constants for each property name. */
	java.lang.String details = "details";

	@Description("Full details of any issues found in the message.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDetails();
	void setDetails(com.braintribe.model.generic.GenericEntity details);
}