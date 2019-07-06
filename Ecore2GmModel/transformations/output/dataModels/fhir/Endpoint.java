/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Endpoint of the Data Model fhir.
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
{@link identifier}, 
{@link connectionType}, 
{@link managingOrganization}, 
{@link contact}, 
{@link period}, 
{@link payloadType}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getConnectionType},
{@link getManagingOrganization},
{@link getContact},
{@link getPeriod},
{@link getPayloadType},
{@link setIdentifier},
{@link setConnectionType},
{@link setManagingOrganization},
{@link setContact},
{@link setPeriod},
{@link setPayloadType},
 */

@Description("The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information.If the element is present, it must have either a @value, an @id, or extensions")

public interface Endpoint extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Endpoint> T = EntityTypes.T(Endpoint.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String connectionType = "connectionType";
	java.lang.String managingOrganization = "managingOrganization";
	java.lang.String contact = "contact";
	java.lang.String period = "period";
	java.lang.String payloadType = "payloadType";

	@Description("Identifier for the organization that is used to identify the endpoint across multiple disparate systems.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook).")
	@Mandatory
	fhir.Coding getConnectionType();
	void setConnectionType(fhir.Coding connectionType);
	@Description("The organization that manages this endpoint (even if technically another organization is hosting this in the cloud, it is the organization associated with the data).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getManagingOrganization();
	void setManagingOrganization(com.braintribe.model.generic.GenericEntity managingOrganization);
	@Description("Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting.")
	
	java.util.List<fhir.ContactPoint> getContact();
	void setContact(java.util.List<fhir.ContactPoint> contact);

	@Description("The interval during which the endpoint is expected to be operational.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
	@Description("The payload type describes the acceptable content that can be communicated on the endpoint.")
	
	java.util.List<fhir.CodeableConcept> getPayloadType();
	void setPayloadType(java.util.List<fhir.CodeableConcept> payloadType);

}
