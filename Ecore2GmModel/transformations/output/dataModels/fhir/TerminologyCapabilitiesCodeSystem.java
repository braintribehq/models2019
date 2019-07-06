/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TerminologyCapabilitiesCodeSystem of the Data Model fhir.
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
{@link version}, 

* It provides of then following operations (getters and setters)
{@link getVersion},
{@link setVersion},
 */

@Description("A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR Terminology Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.")

public interface TerminologyCapabilitiesCodeSystem extends GenericEntity, fhir.BackboneElement {

	EntityType<TerminologyCapabilitiesCodeSystem> T = EntityTypes.T(TerminologyCapabilitiesCodeSystem.class);

	/* Constants for each property name. */
	java.lang.String version = "version";

	@Description("For the code system, a list of versions that are supported by the server.")
	
	java.util.List<fhir.TerminologyCapabilitiesVersion> getVersion();
	void setVersion(java.util.List<fhir.TerminologyCapabilitiesVersion> version);

}
