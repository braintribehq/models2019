/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CapabilityStatementMessaging of the Data Model fhir.
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
{@link endpoint}, 
{@link supportedMessage}, 

* It provides of then following operations (getters and setters)
{@link getEndpoint},
{@link getSupportedMessage},
{@link setEndpoint},
{@link setSupportedMessage},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface CapabilityStatementMessaging extends GenericEntity, fhir.BackboneElement {

	EntityType<CapabilityStatementMessaging> T = EntityTypes.T(CapabilityStatementMessaging.class);

	/* Constants for each property name. */
	java.lang.String endpoint = "endpoint";
	java.lang.String supportedMessage = "supportedMessage";

	@Description("An endpoint (network accessible address) to which messages and/or replies are to be sent.")
	
	java.util.List<fhir.CapabilityStatementEndpoint> getEndpoint();
	void setEndpoint(java.util.List<fhir.CapabilityStatementEndpoint> endpoint);

	@Description("References to message definitions for messages this system can send or receive.")
	
	java.util.List<fhir.CapabilityStatementSupportedMessage> getSupportedMessage();
	void setSupportedMessage(java.util.List<fhir.CapabilityStatementSupportedMessage> supportedMessage);

}
