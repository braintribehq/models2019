/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type NamingSystemUniqueId of the Data Model fhir.
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
{@link period}, 

* It provides of then following operations (getters and setters)
{@link getPeriod},
{@link setPeriod},
 */

@Description("A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a 'System' used within the Identifier and Coding data types.")

public interface NamingSystemUniqueId extends GenericEntity, fhir.BackboneElement {

	EntityType<NamingSystemUniqueId> T = EntityTypes.T(NamingSystemUniqueId.class);

	/* Constants for each property name. */
	java.lang.String period = "period";

	@Description("Identifies the period of time over which this identifier is considered appropriate to refer to the naming system.  Outside of this window, the identifier might be non-deterministic.")
	@Mandatory
	fhir.Period getPeriod();
	void setPeriod(fhir.Period period);
}
