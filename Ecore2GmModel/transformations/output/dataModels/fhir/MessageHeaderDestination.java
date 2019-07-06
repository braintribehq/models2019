/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageHeaderDestination of the Data Model fhir.
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
{@link target}, 
{@link receiver}, 

* It provides of then following operations (getters and setters)
{@link getTarget},
{@link getReceiver},
{@link setTarget},
{@link setReceiver},
 */

@Description("The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.")

public interface MessageHeaderDestination extends GenericEntity, fhir.BackboneElement {

	EntityType<MessageHeaderDestination> T = EntityTypes.T(MessageHeaderDestination.class);

	/* Constants for each property name. */
	java.lang.String target = "target";
	java.lang.String receiver = "receiver";

	@Description("Identifies the target end system in situations where the initial message transmission is to an intermediary system.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getTarget();
	void setTarget(com.braintribe.model.generic.GenericEntity target);
	@Description("Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReceiver();
	void setReceiver(com.braintribe.model.generic.GenericEntity receiver);
}
