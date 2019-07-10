/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Package of the Data Model uml.
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
{@link URI}, 
{@link nestedPackage}, 
{@link nestingPackage}, 
{@link ownedStereotype}, 
{@link ownedType}, 
{@link packageMerge}, 
{@link packagedElement}, 
{@link profileApplication}, 

* It provides of then following operations (getters and setters)
{@link getURI},
{@link getNestedPackage},
{@link getNestingPackage},
{@link getOwnedStereotype},
{@link getOwnedType},
{@link getPackageMerge},
{@link getPackagedElement},
{@link getProfileApplication},
{@link setURI},
{@link setNestedPackage},
{@link setNestingPackage},
{@link setOwnedStereotype},
{@link setOwnedType},
{@link setPackageMerge},
{@link setPackagedElement},
{@link setProfileApplication},
 */

@Description("A package can have one or more profile applications to indicate which profiles have been applied. Because a profile is a package, it is possible to apply a profile not only to packages, but also to profiles.Package specializes TemplateableElement and PackageableElement specializes ParameterableElement to specify that a package can be used as a template and a PackageableElement as a template parameter.A package is used to group elements, and provides a namespace for the grouped elements.<p>From package UML::Packages.</p>")

public interface Package extends GenericEntity, uml.Namespace, uml.Packageableelement, uml.Templateableelement {

	EntityType<Package> T = EntityTypes.T(Package.class);

	/* Constants for each property name. */
	java.lang.String URI = "URI";
	java.lang.String nestedPackage = "nestedPackage";
	java.lang.String nestingPackage = "nestingPackage";
	java.lang.String ownedStereotype = "ownedStereotype";
	java.lang.String ownedType = "ownedType";
	java.lang.String packageMerge = "packageMerge";
	java.lang.String packagedElement = "packagedElement";
	java.lang.String profileApplication = "profileApplication";

	@Description("Provides an identifier for the package that can be used for many purposes. A URI is the universally unique identification of the package following the IETF URI specification, RFC 2396 http://www.ietf.org/rfc/rfc2396.txt and it must comply with those syntax rules.<p>From package UML::Packages.</p>")
	@Mandatory
	types.String getURI();
	void setURI(types.String URI);
	@Description("References the packaged elements that are Packages.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Package> getNestedPackage();
	void setNestedPackage(java.util.List<uml.Package> nestedPackage);

	@Description("References the Package that owns this Package.<p>From package UML::Packages.</p>")
	@Mandatory
	uml.Package getNestingPackage();
	void setNestingPackage(uml.Package nestingPackage);
	@Description("References the Stereotypes that are owned by the Package.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Stereotype> getOwnedStereotype();
	void setOwnedStereotype(java.util.List<uml.Stereotype> ownedStereotype);

	@Description("References the packaged elements that are Types.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Type> getOwnedType();
	void setOwnedType(java.util.List<uml.Type> ownedType);

	@Description("References the PackageMerges that are owned by this Package.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Packagemerge> getPackageMerge();
	void setPackageMerge(java.util.List<uml.Packagemerge> packageMerge);

	@Description("Specifies the packageable elements that are owned by this Package.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Packageableelement> getPackagedElement();
	void setPackagedElement(java.util.List<uml.Packageableelement> packagedElement);

	@Description("References the ProfileApplications that indicate which profiles have been applied to the Package.<p>From package UML::Packages.</p>")
	
	java.util.List<uml.Profileapplication> getProfileApplication();
	void setProfileApplication(java.util.List<uml.Profileapplication> profileApplication);

}
