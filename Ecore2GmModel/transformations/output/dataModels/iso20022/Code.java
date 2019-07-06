/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Code of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link codeName}, 
{@link owner}, 

* It provides of then following operations (getters and setters)
{@link getCodeName},
{@link getOwner},
{@link setCodeName},
{@link setOwner},
 */

@Description("A character string (letters, figures or symbols) that for brevity and/or language independence may be used to represent or replace a definitive value or text of an attribute.")

public interface Code extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<Code> T = EntityTypes.T(Code.class);

	/* Constants for each property name. */
	java.lang.String codeName = "codeName";
	java.lang.String owner = "owner";

	@Description("Provides the full, non-abbreviated name of the Code")
	@Mandatory
	java.lang.String getCodeName();
	void setCodeName(java.lang.String codeName);
	@Description("Direct reference to the CodeSet owning this Code.")
	@Mandatory
	iso20022.CodeSet getOwner();
	void setOwner(iso20022.CodeSet owner);
}
