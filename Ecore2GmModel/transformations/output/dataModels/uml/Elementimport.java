/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Elementimport of the Data Model uml.
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
{@link alias}, 
{@link importedElement}, 
{@link importingNamespace}, 
{@link visibility}, 

* It provides of then following operations (getters and setters)
{@link getAlias},
{@link getImportedElement},
{@link getImportingNamespace},
{@link getVisibility},
{@link setAlias},
{@link setImportedElement},
{@link setImportingNamespace},
{@link setVisibility},
 */

@Description("An ElementImport identifies a NamedElement in a Namespace other than the one that owns that NamedElement and allows the NamedElement to be referenced using an unqualified name in the Namespace owning the ElementImport.<p>From package UML::CommonStructure.</p>")

public interface Elementimport extends GenericEntity, uml.Directedrelationship {

	EntityType<Elementimport> T = EntityTypes.T(Elementimport.class);

	/* Constants for each property name. */
	java.lang.String alias = "alias";
	java.lang.String importedElement = "importedElement";
	java.lang.String importingNamespace = "importingNamespace";
	java.lang.String visibility = "visibility";

	@Description("Specifies the name that should be added to the importing Namespace in lieu of the name of the imported PackagableElement. The alias must not clash with any other member in the importing Namespace. By default, no alias is used.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	types.String getAlias();
	void setAlias(types.String alias);
	@Description("Specifies the PackageableElement whose name is to be added to a Namespace.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Packageableelement getImportedElement();
	void setImportedElement(uml.Packageableelement importedElement);
	@Description("Specifies the Namespace that imports a PackageableElement from another Namespace.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.Namespace getImportingNamespace();
	void setImportingNamespace(uml.Namespace importingNamespace);
	@Description("Specifies the visibility of the imported PackageableElement within the importingNamespace, i.e., whether the  importedElement will in turn be visible to other Namespaces. If the ElementImport is public, the importedElement will be visible outside the importingNamespace while, if the ElementImport is private, it will not.<p>From package UML::CommonStructure.</p>")
	@Mandatory
	uml.VisibilityKind getVisibility();
	void setVisibility(uml.VisibilityKind visibility);
}
