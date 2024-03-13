import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-noticiasenseccionusuarionoregistrado_item';

@customElement('vista-noticiasenseccionusuarionoregistrado')
export class VistaNoticiasenseccionusuarionoregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-text-field style="align-self: center;" readonly value="Noticias en Seccion" has-value></vaadin-text-field>
 <vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: row; flex-wrap: wrap; justify-content: space-between; padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l);">
  <vista-noticiasenseccionusuarionoregistrado_item></vista-noticiasenseccionusuarionoregistrado_item>
  <vista-noticiasenseccionusuarionoregistrado_item></vista-noticiasenseccionusuarionoregistrado_item>
  <vista-noticiasenseccionusuarionoregistrado_item></vista-noticiasenseccionusuarionoregistrado_item>
  <vista-noticiasenseccionusuarionoregistrado_item></vista-noticiasenseccionusuarionoregistrado_item>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
