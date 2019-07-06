/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type VerificationResultAttestation of the Data Model fhir.
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
{@link who}, 
{@link onBehalfOf}, 
{@link communicationMethod}, 
{@link proxySignature}, 
{@link sourceSignature}, 

* It provides of then following operations (getters and setters)
{@link getWho},
{@link getOnBehalfOf},
{@link getCommunicationMethod},
{@link getProxySignature},
{@link getSourceSignature},
{@link setWho},
{@link setOnBehalfOf},
{@link setCommunicationMethod},
{@link setProxySignature},
{@link setSourceSignature},
 */

@Description("Describes validation requirements, source(s), status and dates for one or more elements.")

public interface VerificationResultAttestation extends GenericEntity, fhir.BackboneElement {

	EntityType<VerificationResultAttestation> T = EntityTypes.T(VerificationResultAttestation.class);

	/* Constants for each property name. */
	java.lang.String who = "who";
	java.lang.String onBehalfOf = "onBehalfOf";
	java.lang.String communicationMethod = "communicationMethod";
	java.lang.String proxySignature = "proxySignature";
	java.lang.String sourceSignature = "sourceSignature";

	@Description("The individual or organization attesting to information.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getWho();
	void setWho(com.braintribe.model.generic.GenericEntity who);
	@Description("When the who is asserting on behalf of another (organization or individual).")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getOnBehalfOf();
	void setOnBehalfOf(com.braintribe.model.generic.GenericEntity onBehalfOf);
	@Description("The method by which attested information was submitted/retrieved (manual; API; Push).")
	@Mandatory
	fhir.CodeableConcept getCommunicationMethod();
	void setCommunicationMethod(fhir.CodeableConcept communicationMethod);
	@Description("Signed assertion by the proxy entity indicating that they have the right to submit attested information on behalf of the attestation source.")
	@Mandatory
	fhir.Signature getProxySignature();
	void setProxySignature(fhir.Signature proxySignature);
	@Description("Signed assertion by the attestation source that they have attested to the information.")
	@Mandatory
	fhir.Signature getSourceSignature();
	void setSourceSignature(fhir.Signature sourceSignature);
}
