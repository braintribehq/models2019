/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EPackage of the Data Model ecore.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ecore;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link nsURI}, 
{@link nsPrefix}, 
{@link eFactoryInstance}, 
{@link eClassifiers}, 
{@link eSubpackages}, 
{@link eSuperPackage}, 

* It provides of then following operations (getters and setters)
{@link getNsURI},
{@link getNsPrefix},
{@link getEFactoryInstance},
{@link getEClassifiers},
{@link getESubpackages},
{@link getESuperPackage},
{@link setNsURI},
{@link setNsPrefix},
{@link setEFactoryInstance},
{@link setEClassifiers},
{@link setESubpackages},
{@link setESuperPackage},
 */

@Description("")

public interface EPackage extends GenericEntity, ecore.ENamedElement {

	EntityType<EPackage> T = EntityTypes.T(EPackage.class);

	/* Constants for each property name. */
	java.lang.String nsURI = "nsURI";
	java.lang.String nsPrefix = "nsPrefix";
	java.lang.String eFactoryInstance = "eFactoryInstance";
	java.lang.String eClassifiers = "eClassifiers";
	java.lang.String eSubpackages = "eSubpackages";
	java.lang.String eSuperPackage = "eSuperPackage";

	@Description("")
	@Mandatory
	ecore.EString getNsURI();
	void setNsURI(ecore.EString nsURI);
	@Description("")
	@Mandatory
	ecore.EString getNsPrefix();
	void setNsPrefix(ecore.EString nsPrefix);
	@Description("")
	@Mandatory
	ecore.EFactory getEFactoryInstance();
	void setEFactoryInstance(ecore.EFactory eFactoryInstance);
	@Description("")
	
	java.util.List<ecore.EClassifier> getEClassifiers();
	void setEClassifiers(java.util.List<ecore.EClassifier> eClassifiers);

	@Description("")
	
	java.util.List<ecore.EPackage> getESubpackages();
	void setESubpackages(java.util.List<ecore.EPackage> eSubpackages);

	@Description("")
	@Mandatory
	ecore.EPackage getESuperPackage();
	void setESuperPackage(ecore.EPackage eSuperPackage);
}
