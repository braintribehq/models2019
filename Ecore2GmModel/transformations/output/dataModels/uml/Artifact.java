/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Artifact of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link fileName}, 
{@link manifestation}, 
{@link nestedArtifact}, 
{@link ownedAttribute}, 
{@link ownedOperation}, 

* It provides of then following operations (getters and setters)
{@link getFileName},
{@link getManifestation},
{@link getNestedArtifact},
{@link getOwnedAttribute},
{@link getOwnedOperation},
{@link setFileName},
{@link setManifestation},
{@link setNestedArtifact},
{@link setOwnedAttribute},
{@link setOwnedOperation},
 */

@Description("An artifact is the specification of a physical piece of information that is used or produced by a software development process, or by deployment and operation of a system. Examples of artifacts include model files, source files, scripts, and binary executable files, a table in a database system, a development deliverable, or a word-processing document, a mail message.An artifact is the source of a deployment to a node.<p>From package UML::Deployments.</p>")

public interface Artifact extends GenericEntity, uml.Classifier, uml.Deployedartifact {

	EntityType<Artifact> T = EntityTypes.T(Artifact.class);

	/* Constants for each property name. */
	java.lang.String fileName = "fileName";
	java.lang.String manifestation = "manifestation";
	java.lang.String nestedArtifact = "nestedArtifact";
	java.lang.String ownedAttribute = "ownedAttribute";
	java.lang.String ownedOperation = "ownedOperation";

	@Description("A concrete name that is used to refer to the Artifact in a physical context. Example: file system name, universal resource locator.<p>From package UML::Deployments.</p>")
	@Mandatory
	types.String getFileName();
	void setFileName(types.String fileName);
	@Description("The set of model elements that are manifested in the Artifact. That is, these model elements are utilized in the construction (or generation) of the artifact.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Manifestation> getManifestation();
	void setManifestation(java.util.List<uml.Manifestation> manifestation);

	@Description("The Artifacts that are defined (nested) within the Artifact. The association is a specialization of the ownedMember association from Namespace to NamedElement.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Artifact> getNestedArtifact();
	void setNestedArtifact(java.util.List<uml.Artifact> nestedArtifact);

	@Description("The attributes or association ends defined for the Artifact. The association is a specialization of the ownedMember association.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Property> getOwnedAttribute();
	void setOwnedAttribute(java.util.List<uml.Property> ownedAttribute);

	@Description("The Operations defined for the Artifact. The association is a specialization of the ownedMember association.<p>From package UML::Deployments.</p>")
	
	java.util.List<uml.Operation> getOwnedOperation();
	void setOwnedOperation(java.util.List<uml.Operation> ownedOperation);

}
