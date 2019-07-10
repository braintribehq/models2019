/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Packageimport of the Data Model uml.
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
{@link importedPackage}, 
{@link importingNamespace}, 
{@link visibility}, 

* It provides of then following operations (getters and setters)
{@link getImportedPackage},
{@link getImportingNamespace},
{@link getVisibility},
{@link setImportedPackage},
{@link setImportingNamespace},
{@link setVisibility},
 */

@Description("A PackageImport is a Relationship that imports all the non-private members of a Package into the Namespace owning the PackageImport, so that those Elements may be referred to by their unqualified names in the importingNamespace.<p>From package UML::CommonStructure.</p>")

public interface Packageimport extends GenericEntity, uml.Directedrelationship {

	EntityType<Packageimport> T = EntityTypes.T(Packageimport.class);

	/* Constants for each property name. */
	java.lang.String importedPackage = "importedPackage";
	java.lang.String importingNamespace = "importingNamespace";
	java.lang.String visibility = "visibility";

	@Description("Specifies the Package whose members are imported into a Namespace.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Package getImportedPackage();
	void setImportedPackage(uml.Package importedPackage);
	@Description("Specifies the Namespace that imports the members from a Package.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Namespace getImportingNamespace();
	void setImportingNamespace(uml.Namespace importingNamespace);
	@Description("Specifies the visibility of the imported PackageableElements within the importingNamespace, i.e., whether imported Elements will in turn be visible to other Namespaces. If the PackageImport is public, the imported Elements will be visible outside the importingNamespace, while, if the PackageImport is private, they will not.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.VisibilityKind getVisibility();
	void setVisibility(uml.VisibilityKind visibility);
}
