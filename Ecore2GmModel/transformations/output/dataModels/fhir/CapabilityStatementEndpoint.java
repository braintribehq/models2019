/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CapabilityStatementEndpoint of the Data Model fhir.
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
{@link protocol}, 

* It provides of then following operations (getters and setters)
{@link getProtocol},
{@link setProtocol},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface CapabilityStatementEndpoint extends GenericEntity, fhir.BackboneElement {

	EntityType<CapabilityStatementEndpoint> T = EntityTypes.T(CapabilityStatementEndpoint.class);

	/* Constants for each property name. */
	java.lang.String protocol = "protocol";

	@Description("A list of the messaging transport protocol(s) identifiers, supported by this endpoint.")
	@Mandatory
	fhir.Coding getProtocol();
	void setProtocol(fhir.Coding protocol);
}
