/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Subscription of the Data Model fhir.
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
{@link contact}, 
{@link channel}, 

* It provides of then following operations (getters and setters)
{@link getContact},
{@link getChannel},
{@link setContact},
{@link setChannel},
 */

@Description("The subscription resource is used to define a push-based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined 'channel' so that another system can take an appropriate action.If the element is present, it must have either a @value, an @id, or extensions")

public interface Subscription extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Subscription> T = EntityTypes.T(Subscription.class);

	/* Constants for each property name. */
	java.lang.String contact = "contact";
	java.lang.String channel = "channel";

	@Description("Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.")
	
	java.util.List<fhir.ContactPoint> getContact();
	void setContact(java.util.List<fhir.ContactPoint> contact);

	@Description("Details where to send notifications when resources are received that meet the criteria.")
	@Mandatory
	fhir.SubscriptionChannel getChannel();
	void setChannel(fhir.SubscriptionChannel channel);
}
