/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type BusinessAssociationEnd of the Data Model iso20022.
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
{@link opposite}, 
{@link aggregation}, 
{@link type}, 

* It provides of then following operations (getters and setters)
{@link getOpposite},
{@link getAggregation},
{@link getType},
{@link setOpposite},
{@link setAggregation},
{@link setType},
 */

@Description("The context of a BusinessAssociation must be the type of its opposite and vice-versa")

public interface BusinessAssociationEnd extends GenericEntity, iso20022.BusinessElement {

	EntityType<BusinessAssociationEnd> T = EntityTypes.T(BusinessAssociationEnd.class);

	/* Constants for each property name. */
	java.lang.String opposite = "opposite";
	java.lang.String aggregation = "aggregation";
	java.lang.String type = "type";

	@Description("Opposite end of a bi-directional relationship between 2 BusinessComponents.")
	@Mandatory
	iso20022.BusinessAssociationEnd getOpposite();
	void setOpposite(iso20022.BusinessAssociationEnd opposite);
	@Description("Expresses the strength of the semantic relationship between two BusinessComponents.")
	@Mandatory
	iso20022.Aggregation getAggregation();
	void setAggregation(iso20022.Aggregation aggregation);
	@Description("Specifies that a BusinessAssociationEnd always has a complex content model and is therefore always typed by a BusinessComponent, contrarily to a BusinessAttribute which may be typed by a data type.")
	@Mandatory
	iso20022.BusinessComponent getType();
	void setType(iso20022.BusinessComponent type);
}
