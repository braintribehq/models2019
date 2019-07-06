/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TopLevelDictionaryEntry of the Data Model iso20022.
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
{@link dataDictionary}, 

* It provides of then following operations (getters and setters)
{@link getDataDictionary},
{@link setDataDictionary},
 */

@Description("artefact in the Dictionary that is not owned by another artefact in the Repository")
 
@Abstract 

public interface TopLevelDictionaryEntry extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<TopLevelDictionaryEntry> T = EntityTypes.T(TopLevelDictionaryEntry.class);

	/* Constants for each property name. */
	java.lang.String dataDictionary = "dataDictionary";

	@Description("the DataDictionary that contains all ISO 20022 TopLevelDictionaryEntries")
	@Mandatory
	iso20022.DataDictionary getDataDictionary();
	void setDataDictionary(iso20022.DataDictionary dataDictionary);
}
