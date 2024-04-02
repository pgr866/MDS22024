import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-mostrarmisnoticias')
export class VistaMostrarmisnoticias extends LitElement {
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
<vaadin-vertical-layout theme="" style="width: 100%; height: 100%; justify-content: center;" id="Layoutmostrarmisnoticias">
 <vaadin-combo-box style="width: 100%; flex-shrink: 0;" placeholder="Ver mis noticias" .items="${['Noticia1', 'Noticia2']}" id="Comboboxmostrarmisnoticias">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-combo-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
