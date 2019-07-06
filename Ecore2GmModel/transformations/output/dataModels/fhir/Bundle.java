/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Bundle of the Data Model fhir.
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
{@link link}, 
{@link entry}, 
{@link signature}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getLink},
{@link getEntry},
{@link getSignature},
{@link setIdentifier},
{@link setLink},
{@link setEntry},
{@link setSignature},
 */

@Description("A container for a collection of resources.If the element is present, it must have either a @value, an @id, or extensions")

public interface Bundle extends GenericEntity, fhir.FhirResource {

	EntityType<Bundle> T = EntityTypes.T(Bundle.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String link = "link";
	java.lang.String entry = "entry";
	java.lang.String signature = "signature";

	@Description("A persistent identifier for the bundle that won't change as a bundle is copied from server to server.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("A series of links that provide context to this bundle.")
	
	java.util.List<fhir.BundleLink> getLink();
	void setLink(java.util.List<fhir.BundleLink> link);

	@Description("An entry in a bundle resource - will either contain a resource or information about a resource (transactions and history only).")
	
	java.util.List<fhir.BundleEntry> getEntry();
	void setEntry(java.util.List<fhir.BundleEntry> entry);

	@Description("Digital Signature - base64 encoded. XML-DSig or a JWT.")
	@Mandatory
	fhir.Signature getSignature();
	void setSignature(fhir.Signature signature);
}
