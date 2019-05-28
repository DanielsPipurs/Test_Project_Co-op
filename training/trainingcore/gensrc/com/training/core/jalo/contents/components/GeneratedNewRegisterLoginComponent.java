/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 28, 2019 1:17:19 PM                     ---
 * ----------------------------------------------------------------
 */
package com.training.core.jalo.contents.components;

import com.stackextend.training.core.constants.TrainingCoreConstants;
import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.training.core.jalo.contents.components.NewRegisterLoginComponent NewRegisterLoginComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedNewRegisterLoginComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>NewRegisterLoginComponent.background</code> attribute **/
	public static final String BACKGROUND = "background";
	/** Qualifier of the <code>NewRegisterLoginComponent.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>NewRegisterLoginComponent.link</code> attribute **/
	public static final String LINK = "link";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BACKGROUND, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(LINK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.background</code> attribute.
	 * @return the background - Background
	 */
	public Media getBackground(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.getBackground requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, BACKGROUND);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.background</code> attribute.
	 * @return the background - Background
	 */
	public Media getBackground()
	{
		return getBackground( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @return the localized background - Background
	 */
	public Map<Language,Media> getAllBackground(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,BACKGROUND,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @return the localized background - Background
	 */
	public Map<Language,Media> getAllBackground()
	{
		return getAllBackground( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @param value the background - Background
	 */
	public void setBackground(final SessionContext ctx, final Media value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.setBackground requires a session language", 0 );
		}
		setLocalizedProperty(ctx, BACKGROUND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @param value the background - Background
	 */
	public void setBackground(final Media value)
	{
		setBackground( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @param value the background - Background
	 */
	public void setAllBackground(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,BACKGROUND,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.background</code> attribute. 
	 * @param value the background - Background
	 */
	public void setAllBackground(final Map<Language,Media> value)
	{
		setAllBackground( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.getDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.description</code> attribute.
	 * @return the description - Description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,DESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @return the localized description - Description
	 */
	public Map<Language,String> getAllDescription()
	{
		return getAllDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.setDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.description</code> attribute. 
	 * @param value the description - Description
	 */
	public void setAllDescription(final Map<Language,String> value)
	{
		setAllDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.link</code> attribute.
	 * @return the link - Link
	 */
	public String getLink(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.getLink requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, LINK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.link</code> attribute.
	 * @return the link - Link
	 */
	public String getLink()
	{
		return getLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @return the localized link - Link
	 */
	public Map<Language,String> getAllLink(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,LINK,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @return the localized link - Link
	 */
	public Map<Language,String> getAllLink()
	{
		return getAllLink( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @param value the link - Link
	 */
	public void setLink(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedNewRegisterLoginComponent.setLink requires a session language", 0 );
		}
		setLocalizedProperty(ctx, LINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @param value the link - Link
	 */
	public void setLink(final String value)
	{
		setLink( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @param value the link - Link
	 */
	public void setAllLink(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,LINK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>NewRegisterLoginComponent.link</code> attribute. 
	 * @param value the link - Link
	 */
	public void setAllLink(final Map<Language,String> value)
	{
		setAllLink( getSession().getSessionContext(), value );
	}
	
}
