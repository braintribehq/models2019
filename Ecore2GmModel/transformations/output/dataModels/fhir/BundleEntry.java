/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BundleEntry of the Data Model fhir.
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
{@link link}, 
{@link resource}, 
{@link search}, 
{@link request}, 
{@link response}, 

* It provides of then following operations (getters and setters)
{@link getLink},
{@link getResource},
{@link getSearch},
{@link getRequest},
{@link getResponse},
{@link setLink},
{@link setResource},
{@link setSearch},
{@link setRequest},
{@link setResponse},
 */

@Description("A container for a collection of resources.")

public interface BundleEntry extends GenericEntity, fhir.BackboneElement {

	EntityType<BundleEntry> T = EntityTypes.T(BundleEntry.class);

	/* Constants for each property name. */
	java.lang.String link = "link";
	java.lang.String resource = "resource";
	java.lang.String search = "search";
	java.lang.String request = "request";
	java.lang.String response = "response";

	@Description("A series of links that provide context to this entry.")
	
	java.util.List<fhir.BundleLink> getLink();
	void setLink(java.util.List<fhir.BundleLink> link);

	@Description("The Resource for the entry. The purpose/meaning of the resource is determined by the Bundle.type.")
	@Mandatory
	fhir.FhirResourceContainer getResource();
	void setResource(fhir.FhirResourceContainer resource);
	@Description("Information about the search process that lead to the creation of this entry.")
	@Mandatory
	fhir.BundleSearch getSearch();
	void setSearch(fhir.BundleSearch search);
	@Description("Additional information about how this entry should be processed as part of a transaction or batch.  For history, it shows how the entry was processed to create the version contained in the entry.")
	@Mandatory
	fhir.BundleRequest getRequest();
	void setRequest(fhir.BundleRequest request);
	@Description("Indicates the results of processing the corresponding 'request' entry in the batch or transaction being responded to or what the results of an operation where when returning history.")
	@Mandatory
	fhir.BundleResponse getResponse();
	void setResponse(fhir.BundleResponse response);
}
