/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DocumentManifestRelated of the Data Model fhir.
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
{@link ref}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getRef},
{@link setIdentifier},
{@link setRef},
 */

@Description("A collection of documents compiled for a purpose together with metadata that applies to the collection.")

public interface DocumentManifestRelated extends GenericEntity, fhir.BackboneElement {

	EntityType<DocumentManifestRelated> T = EntityTypes.T(DocumentManifestRelated.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String ref = "ref";

	@Description("Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.")
	@Mandatory
	fhir.Identifier getIdentifier();
	void setIdentifier(fhir.Identifier identifier);
	@Description("Related Resource to this DocumentManifest. For example, Order, ServiceRequest,  Procedure, EligibilityRequest, etc.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRef();
	void setRef(com.braintribe.model.generic.GenericEntity ref);
}
