import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-listadonoticiasportada')
export class VistaListadonoticiasportada extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="Layoutlistadonoticiasportada">
 <vaadin-text-field style="flex-shrink: 0; align-self: center;" readonly value="Noticias de Actualidad" has-value id="Labellistadonoticiasportada"></vaadin-text-field>
 <vaadin-horizontal-layout theme="" style="width: 100%; flex-shrink: 0; flex-direction: row; justify-content: space-between; flex-wrap: wrap; padding: var(--lumo-space-m); padding-right: var(--lumo-space-l); padding-left: var(--lumo-space-l); flex-grow: 1;" id="Listadonoticiasportada"></vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
