/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type RepositoryConcept of the Data Model iso20022.
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
{@link name}, 
{@link definition}, 
{@link semanticMarkup}, 
{@link doclet}, 
{@link example}, 
{@link constraint}, 
{@link registrationStatus}, 
{@link removalDate}, 

* It provides of then following operations (getters and setters)
{@link getName},
{@link getDefinition},
{@link getSemanticMarkup},
{@link getDoclet},
{@link getExample},
{@link getConstraint},
{@link getRegistrationStatus},
{@link getRemovalDate},
{@link setName},
{@link setDefinition},
{@link setSemanticMarkup},
{@link setDoclet},
{@link setExample},
{@link setConstraint},
{@link setRegistrationStatus},
{@link setRemovalDate},
 */

@Description("artefact that has been defined during the development of an ISO 20022 MessageDefinition and which is stored in the Repository")
 
@Abstract 

public interface RepositoryConcept extends GenericEntity, iso20022.ModelEntity {

	EntityType<RepositoryConcept> T = EntityTypes.T(RepositoryConcept.class);

	/* Constants for each property name. */
	java.lang.String name = "name";
	java.lang.String definition = "definition";
	java.lang.String semanticMarkup = "semanticMarkup";
	java.lang.String doclet = "doclet";
	java.lang.String example = "example";
	java.lang.String constraint = "constraint";
	java.lang.String registrationStatus = "registrationStatus";
	java.lang.String removalDate = "removalDate";

	@Description("a word or set of words by which a RepositoryConcept is known, addressed or referred to")
	@Mandatory
	java.lang.String getName();
	void setName(java.lang.String name);
	@Description("describes the semantic meaning of a RepositoryConcept")
	@Mandatory
	java.lang.String getDefinition();
	void setDefinition(java.lang.String definition);
	@Description("Enables modelers to markup elements of the Repository with semantic metadata.")
	
	java.util.List<iso20022.SemanticMarkup> getSemanticMarkup();
	void setSemanticMarkup(java.util.List<iso20022.SemanticMarkup> semanticMarkup);

	@Description("Doclets of the entity, used for documentation.")
	
	java.util.List<iso20022.Doclet> getDoclet();
	void setDoclet(java.util.List<iso20022.Doclet> doclet);

	@Description("provides a representative instance of a RepositoryConcept")
	
	java.util.List<java.lang.String> getExample();
	void setExample(java.util.List<java.lang.String> example);

	@Description("a property of a RepositoryConcept specifying a semantic condition or restriction expressed in natural language text and potentially in a formal notation")
	
	java.util.List<iso20022.Constraint> getConstraint();
	void setConstraint(java.util.List<iso20022.Constraint> constraint);

	@Description("specifies in which stage of the registration lifecycle a RepositoryConcept is in")
	@Mandatory
	iso20022.RegistrationStatus getRegistrationStatus();
	void setRegistrationStatus(iso20022.RegistrationStatus registrationStatus);
	@Description("specifies the date at which a RepositoryConcept will cease or has ceased to be part of the Repository")
	@Mandatory
	java.util.Date getRemovalDate();
	void setRemovalDate(java.util.Date removalDate);
}
