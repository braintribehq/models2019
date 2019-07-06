/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CapabilityStatementImplementation of the Data Model fhir.
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
{@link custodian}, 

* It provides of then following operations (getters and setters)
{@link getCustodian},
{@link setCustodian},
 */

@Description("A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a particular version of FHIR that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface CapabilityStatementImplementation extends GenericEntity, fhir.BackboneElement {

	EntityType<CapabilityStatementImplementation> T = EntityTypes.T(CapabilityStatementImplementation.class);

	/* Constants for each property name. */
	java.lang.String custodian = "custodian";

	@Description("The organization responsible for the management of the instance and oversight of the data on the server at the specified URL.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCustodian();
	void setCustodian(com.braintribe.model.generic.GenericEntity custodian);
}
