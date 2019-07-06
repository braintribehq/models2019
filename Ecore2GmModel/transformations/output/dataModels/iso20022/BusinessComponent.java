/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessComponent of the Data Model iso20022.
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
{@link subType}, 
{@link superType}, 
{@link element}, 
{@link derivationComponent}, 
{@link associationDomain}, 
{@link derivationElement}, 

* It provides of then following operations (getters and setters)
{@link getSubType},
{@link getSuperType},
{@link getElement},
{@link getDerivationComponent},
{@link getAssociationDomain},
{@link getDerivationElement},
{@link setSubType},
{@link setSuperType},
{@link setElement},
{@link setDerivationComponent},
{@link setAssociationDomain},
{@link setDerivationElement},
 */

@Description("Representation of a (part of a) key business notion, characterized by specific BusinessElements.")

public interface BusinessComponent extends GenericEntity, iso20022.TopLevelDictionaryEntry, iso20022.BusinessElementType, iso20022.BusinessConcept {

	EntityType<BusinessComponent> T = EntityTypes.T(BusinessComponent.class);

	/* Constants for each property name. */
	java.lang.String subType = "subType";
	java.lang.String superType = "superType";
	java.lang.String element = "element";
	java.lang.String derivationComponent = "derivationComponent";
	java.lang.String associationDomain = "associationDomain";
	java.lang.String derivationElement = "derivationElement";

	@Description("The BusinessComponents that specialize this BusinessComponent.")
	
	java.util.List<iso20022.BusinessComponent> getSubType();
	void setSubType(java.util.List<iso20022.BusinessComponent> subType);

	@Description("The BusinessComponent that is specialized by this BusinessComponent.")
	@Mandatory
	iso20022.BusinessComponent getSuperType();
	void setSuperType(iso20022.BusinessComponent superType);
	@Description("A semantic property of a BusinessComponent.")
	
	java.util.List<iso20022.BusinessElement> getElement();
	void setElement(java.util.List<iso20022.BusinessElement> element);

	@Description("All of the MessageComponentTypes that derive from this BusinessComponent.")
	
	java.util.List<iso20022.MessageComponentType> getDerivationComponent();
	void setDerivationComponent(java.util.List<iso20022.MessageComponentType> derivationComponent);

	@Description("Describes the semantics that determine how the BusinessComponent may participate in the BusinessAssociation.")
	
	java.util.List<iso20022.BusinessAssociationEnd> getAssociationDomain();
	void setAssociationDomain(java.util.List<iso20022.BusinessAssociationEnd> associationDomain);

	@Description("All of the MessageElements that derive from this BusinessComponent.")
	
	java.util.List<iso20022.MessageElement> getDerivationElement();
	void setDerivationElement(java.util.List<iso20022.MessageElement> derivationElement);

}
